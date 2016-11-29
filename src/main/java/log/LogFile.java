package log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogFile extends LogAbstract {

    public void logUserInfo(String email, String ip, Date data, String servletName,boolean existUser) {
        setEmail(email.split("@")[0]);
        setIp(ip);
        setData(data);
        setServletName(servletName);
        setExistUser(existUser);
    }

    public void write(File file) {
        try {
            FileWriter writer = new FileWriter(file.getPath(), true);
            writer.write(mountText());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
