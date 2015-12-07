package hhtesttask.task3;

import java.util.Date;

public class SmartPhone {
	private String model;
    private Date date;
    private String revision;
    
    public SmartPhone(String model, Date date, String revision) {
    	/* this.model = model;
        this.date = date;
        this.revision = revision;*/
    	
    	this.model = model;
        this.date = date;
        this.revision = revision;
    }
    
    /*public int hashCode() {
        return new Random().nextInt();
    }*/
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((revision == null) ? 0 : revision.hashCode());
		return result;
	}
    
    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      SmartPhone that = (SmartPhone) o;

      if (!date.equals(that.date)) return false;
      if (!model.equals(that.model)) return false;
      if (!revision.equals(that.revision)) return false;

      return true;
    }
}
