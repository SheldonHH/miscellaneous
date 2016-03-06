//jQuery(document).ready(function($){
   //trigger when there are X posts left before the fold
  
//console.log("Plugin Abandoned Emails Starting...");
var catch_email =0;


function validateEmail(email) {
    var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    return re.test(email);
}


//If is revv donation page or shop page only. See if those classes exist...
if ( jQuery( ".woocommerce-checkout-payment" ).length || jQuery( ".credit-card-info" ).length ) {


    jQuery("input[type*='email']").focusout(function() {

        
        //console.log("email field blur event....");
        
    }).blur(function() {
        


        if (catch_email == 0) {
            //console.log("catch_email is 0");
                var form_id = jQuery(this).closest('form').attr('id');
                if (form_id != undefined && form_id != '') {
                    form_id = form_id.replace(/gform_/i, '');
                } else {
                    form_id = '';
                }
                var email = jQuery(this).val();
                //console.log('the email is ' + email);
                //Value from Donate
                var value =jQuery(".ginput_total").html();
                //console.log('the value is ' + value); 
                if (value == "$0.00"){
                    //try get amount from WooCommerce
                    value = '';
                    // Don't store cart value
                    //value =jQuery(".amount:last").html();
                    //console.log('the value from Woocommerce is ' + value); 

                }


                //path
                var path = window.location.pathname; // document.URL; // full URL

                //origin URL
                var origin = "";
                jQuery("input[type*='hidden']").each(function(i, obj) {
                    
                    var address = jQuery(this).attr('value');
                    var res = address.substring(0, 4);
                    if (res == "http") {
                        origin = address;
                        return false; //break
                    }

                });

                //CART PRODUCTS
                var products ="";
                var qty = "";
                var each_value = "";

                //if page is cart, get the items too
                if (path == "/cart/") {
                        jQuery( ".cart_item-cell" ).each(function( index ) {

                            if (index > 0){
                                    var product = jQuery(this).find(".product-name a").html();
                                    // remove space from end of string
                                    product = product.substring(0, product.length - 1);
                                    products = products + "," + product;
                                    qty = qty + "," + jQuery(this).find(".quantity input").val();
                                    each_value = each_value + "," + jQuery(this).find(".product-subtotal .amount").html();
                                    
                            }
                            else{
                                    var product = jQuery(this).find(".product-name a").html();
                                    // remove space from end of string
                                    product = product.substring(0, product.length - 1);
                                    products = product;
                                    qty = jQuery(this).find(".quantity input").val();
                                    each_value = jQuery(this).find(".product-subtotal .amount").html();
                            }
                        });
                }

               
                //console.log(products); 
                products = products.replace(/ /g, '_')
                //console.log(products);
                //console.log(qty);
                //console.log(each_value);

                if (validateEmail(email)) {
                    var fullPath = document.URL;
                    jQuery.ajax({
                        url:  abandoned_email_function.ajax_url,
                        type: 'POST',
                        data: {
                            action: 'abandoned_email_function',
                            email: email,
                            form_id: form_id,
                            value: value,
                            path: fullPath,
                            origin: origin,
                            products: products,
                            qty: qty,
                            each_value: each_value,

                        },
                        success: function( response ) {

                            //console.log(response);
                            //console.log("success");

                        },
                        complete: function() {
                          //console.log('ae: done.');
                          catch_email = 1;




                        }
                    }); 

              } else {
                //console.log('no valid email');
              }
      
        } //if catch_email

    });

}



    

//});
