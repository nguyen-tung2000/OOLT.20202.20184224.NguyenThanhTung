package media;

public abstract class Media implements Comparable<Media> {
	protected String title;
	protected int id;
	protected String category;

	protected float cost;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	protected String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public Media() {
		
	}

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Media) {
			Media  a = (Media) obj;
			if(this.id == a.id) {
				return true;
			}
		}
		return false;
	}
	 public int compareTo(Media obj) {
	    	return title.compareTo((obj).getTitle());
	    	
	    }
}