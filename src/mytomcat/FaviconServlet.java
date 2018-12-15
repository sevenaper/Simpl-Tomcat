package mytomcat;

import java.io.IOException;

public class FaviconServlet extends MyServlet
{
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse)
    {
        try
        {
            myResponse.write("get favicon...");
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse)
    {
        try
        {
            myResponse.write("post favicon...");
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
