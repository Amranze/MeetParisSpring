package meetinparis.core.models;

public class Message {
	public final static int STATUS_RECEIVED = 0;
	public final static int STATUS_SENDING  = 1;
	public final static int STATUS_SENT 	= 2;
	public final static int STATUS_READ 	= 3;
	public final static int STATUS_FAILED 	= 4;
	
    private long id;
    private long idSender;
    private long idReceiver;
    private String message;
    private long timeStamp;
    private String senderUrl;
    /*private boolean messageSent;
    private boolean messageRead;
    private boolean messageReceived;*/
    private int status;
    
	public Message(long id, long idSender, long idReceiver, String message, long timeStamp, String senderUrl,
			int status) {
		super();
		this.id = id;
		this.idSender = idSender;
		this.idReceiver = idReceiver;
		this.message = message;
		this.timeStamp = timeStamp;
		this.senderUrl = senderUrl;
		this.status = status;
	}
	public Message() {
		super();
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", idSender=" + idSender + ", idReceiver=" + idReceiver + ", message=" + message
				+ ", timeStamp=" + timeStamp + ", senderUrl=" + senderUrl + ", status=" + status + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdSender() {
		return idSender;
	}
	public void setIdSender(long idSender) {
		this.idSender = idSender;
	}
	public long getIdReceiver() {
		return idReceiver;
	}
	public void setIdReceiver(long idReceiver) {
		this.idReceiver = idReceiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getSenderUrl() {
		return senderUrl;
	}
	public void setSenderUrl(String senderUrl) {
		this.senderUrl = senderUrl;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
