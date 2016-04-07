
public class Variable {

	private String datatype;
	private String identifier;

	public Variable(String datatype, String identifier) {
		super();
		this.datatype = datatype;
		this.identifier = identifier;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return datatype + " " + identifier;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Variable)) return false;
        Variable key = (Variable) o;
        return datatype == key.datatype && identifier == key.identifier;
    }
	
	
}
