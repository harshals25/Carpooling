
package pool.dto;


public class Manager 
 {
    private int serialNo;
    private String id;
    private String pass;
    private String post;

    public Manager() {
    }

    public Manager(String id, String pass, String post) 
    {
        this.id = id;
        this.pass = pass;
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
    
    
}
