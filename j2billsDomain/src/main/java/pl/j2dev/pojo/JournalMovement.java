package pl.j2dev.pojo;

public class JournalMovement {

	Journal source;
	Journal target;
	public Journal getSource() {
		return source;
	}
	public void setSource(Journal source) {
		this.source = source;
	}
	public Journal getTarget() {
		return target;
	}
	public void setTarget(Journal target) {
		this.target = target;
	}
	@Override
	public String toString() {
		return "JournalMovement [source=" + source + ", target=" + target + "]";
	}
	
	
	
}
