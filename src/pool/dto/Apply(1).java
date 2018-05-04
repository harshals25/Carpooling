
package pool.dto;
public class Apply 
{
    private int serialNo;
    private String  empId;
    private String post;
    private String salary;
    private String dateOfApply;
    private String carType;
    private String location;
    private String status;

    public Apply() {
    }

    public Apply(String empId, String post, String salary, String dateOfApply, String carType, String location, String status) {
        this.empId = empId;
        this.post = post;
        this.salary = salary;
        this.dateOfApply = dateOfApply;
        this.carType = carType;
        this.location = location;
        this.status=status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDateOfApply() {
        return dateOfApply;
    }

    public void setDateOfApply(String dateOfApply) {
        this.dateOfApply = dateOfApply;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status=status;
    }
    
    
}
