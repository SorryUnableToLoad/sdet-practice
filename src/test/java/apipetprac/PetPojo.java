package apipetprac;
/*
{
  "id": 1,
  "category": {
    "id": 0,
    "name": "string"
  },
  "name": "doggie",
  "photoUrls": [
    "string"
  ],
  "tags": [
    {
      "id": 0,
      "name": "string"
    }
  ],
  "status": "available"
}
 */
public class PetPojo {
	private int id;
	private Category category;
	private String name;
	private String[] photoUrls;
	private Tag[] tags;
	private String status;

	public PetPojo() {
		
	}

	public PetPojo(int i, Category category2, String string, String[] photoUrls2, Tag[] tags2, String string2) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}

	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}

