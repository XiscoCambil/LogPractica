package log;

import java.io.File;
import java.util.Date;

/**
 * Created by blackwidow on 22/11/16.
 */
public interface Log {

   void logUserInfo(String email, String ip, Date data, String servletName, boolean existUser);
   void write(File file);
}