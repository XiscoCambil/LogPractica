package log;

import java.util.Date;

/**
 * @author Xavi Torrens
 */
public abstract class LogAbstract {

    private String email;
    private String ip;
    private Date data;
    private String servletName;
    private boolean existUser;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public boolean isExistUser() {
        return existUser;
    }

    public void setExistUser(boolean existUser) {
        this.existUser = existUser;
    }

    public String mountText() {
        if (isExistUser()) {
            return "el usuario " + getEmail() + " con la ip " + getIp() + " ha accedido el dia " + getData() + " al servlet " + getServletName() + "\r\n";
        }else{
            return "hay una peticion en el servlet "+getServletName()+" el dia "+getData()+" desde la ip "+getIp()+"\r\n";
        }
    }

}
