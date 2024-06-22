package com.example.Ilog.domain.issue;

public class IssueEntity {

    //region Fields

    private long id;
    private String summary;
    private  String description;

    //endregion

    //region Constructors

    /**
     * Initializes a new instance of this class.
     * @param id the issue ID.
     * @param summary the issue summary.
     * @param description the issue description.
     */
    public IssueEntity(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    //endregion

    //region Getters / Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //endregion
}
