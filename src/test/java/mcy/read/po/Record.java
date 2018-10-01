package mcy.read.po;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/30
 * @Description :
 */
public class Record {
    private Integer id;
    private Integer userID;
    private String record;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
