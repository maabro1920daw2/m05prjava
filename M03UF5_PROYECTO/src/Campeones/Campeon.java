package Campeones;

public class Campeon {
	private int key;
	private String id, name, title;
	private statsCampeon stats;
	
	public Campeon() {}	

	public Campeon(int key, String id, String name, String title) {
		super();
		this.key = key;
		this.id = id;
		this.name = name;
		this.title = title;
	}

	public int getKey() {
		return key;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public statsCampeon getStats() {
		return stats;
	}

	public void setStats(statsCampeon stats) {
		this.stats = stats;
	}
	
	
}
