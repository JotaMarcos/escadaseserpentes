package escadaseserpentes;

public class Space {
	
	public enum Type {
		START_HERE, HOME, REGULAR;
	}
	
	
	private int number;
	private Type type;
	
	public Space(int number, Type type) {
		super();
		this.number = number;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		if (type == Type.REGULAR) {
			return String.valueOf(number);
		} else {
			return number + " (" + type + ")";
		}
	}
	
	
	
	
	
	
	
	

}
