package mytomcat;

import java.io.IOException;
import java.io.OutputStream;

public class MyResponse
{
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream)
    {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException
    {
        /*
        HTTP 响应协议
        HTTP/1.1 200 OK
        Content-type : text/html
        <html><body></body></html>
         */
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1,0 200 OK\n").
                append("Content-type: text/html\n").
                append("\r\n").
                append("<html><body>").
                append(content).
                append("</body></html>");

        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }
}
