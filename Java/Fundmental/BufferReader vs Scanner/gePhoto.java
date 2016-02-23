@POST
@Path("/getphotos")
@Produces(MediaType.TEXT_HTML)
public String getPhotos() throws IOException{
//DataInputStream rd = new DataInputStream(request.getInputStream());
BufferedReader rd = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
    String line=null;
    String message = new String();
    final StringBuffer buffer = new StringBuffer(2048);
    while ((line = rd.readLine()) != null) {
        //buffer.append(line);
        message += line;
    }
    System.out.println(message);
    JsonObject json = new JsonObject(message);
    return message;
}