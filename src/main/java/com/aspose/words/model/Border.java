package com.aspose.words.model;

import com.aspose.words.model.LineStyle;
public class Border {
  private LineStyle LineStyle = null;
  private Double LineWidth = null;
  private String Color = null;
  private Double DistanceFromText = null;
  private Boolean Shadow = null;
  /**
	 * getLineStyle
	 * Gets LineStyle
	 * @return LineStyle
	 */
  public LineStyle getLineStyle() {
    return LineStyle;
  }

	/**
	 * setLineStyle
	 * Sets LineStyle
	 * @param LineStyle LineStyle
	 */
  public void setLineStyle(LineStyle LineStyle) {
    this.LineStyle = LineStyle;
  }

  /**
	 * getLineWidth
	 * Gets Double
	 * @return LineWidth
	 */
  public Double getLineWidth() {
    return LineWidth;
  }

	/**
	 * setLineWidth
	 * Sets Double
	 * @param LineWidth Double
	 */
  public void setLineWidth(Double LineWidth) {
    this.LineWidth = LineWidth;
  }

  /**
	 * getColor
	 * Gets String
	 * @return Color
	 */
  public String getColor() {
    return Color;
  }

	/**
	 * setColor
	 * Sets String
	 * @param Color String
	 */
  public void setColor(String Color) {
    this.Color = Color;
  }

  /**
	 * getDistanceFromText
	 * Gets Double
	 * @return DistanceFromText
	 */
  public Double getDistanceFromText() {
    return DistanceFromText;
  }

	/**
	 * setDistanceFromText
	 * Sets Double
	 * @param DistanceFromText Double
	 */
  public void setDistanceFromText(Double DistanceFromText) {
    this.DistanceFromText = DistanceFromText;
  }

  /**
	 * getShadow
	 * Gets Boolean
	 * @return Shadow
	 */
  public Boolean getShadow() {
    return Shadow;
  }

	/**
	 * setShadow
	 * Sets Boolean
	 * @param Shadow Boolean
	 */
  public void setShadow(Boolean Shadow) {
    this.Shadow = Shadow;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Border {\n");
    sb.append("  LineStyle: ").append(LineStyle).append("\n");
    sb.append("  LineWidth: ").append(LineWidth).append("\n");
    sb.append("  Color: ").append(Color).append("\n");
    sb.append("  DistanceFromText: ").append(DistanceFromText).append("\n");
    sb.append("  Shadow: ").append(Shadow).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

