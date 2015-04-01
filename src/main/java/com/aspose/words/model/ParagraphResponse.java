package com.aspose.words.model;

import com.aspose.words.model.Paragraph;
public class ParagraphResponse {
  private Paragraph Paragraph = null;
  private String Code = null;
  private String Status = null;
  /**
	 * getParagraph
	 * Gets Paragraph
	 * @return Paragraph
	 */
  public Paragraph getParagraph() {
    return Paragraph;
  }

	/**
	 * setParagraph
	 * Sets Paragraph
	 * @param Paragraph Paragraph
	 */
  public void setParagraph(Paragraph Paragraph) {
    this.Paragraph = Paragraph;
  }

  /**
	 * getCode
	 * Gets String
	 * @return Code
	 */
  public String getCode() {
    return Code;
  }

	/**
	 * setCode
	 * Sets String
	 * @param Code String
	 */
  public void setCode(String Code) {
    this.Code = Code;
  }

  /**
	 * getStatus
	 * Gets String
	 * @return Status
	 */
  public String getStatus() {
    return Status;
  }

	/**
	 * setStatus
	 * Sets String
	 * @param Status String
	 */
  public void setStatus(String Status) {
    this.Status = Status;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphResponse {\n");
    sb.append("  Paragraph: ").append(Paragraph).append("\n");
    sb.append("  Code: ").append(Code).append("\n");
    sb.append("  Status: ").append(Status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

