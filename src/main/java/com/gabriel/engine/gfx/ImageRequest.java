package com.gabriel.engine.gfx;

public class ImageRequest {

	public Image image;
	public int zDepth;
	public int offX;
	public int offY;

	public ImageRequest(Image image, int zDepth, int offX, int offY) {

		this.image = image;
		this.zDepth = zDepth;
		this.offX = offX;
		this.offY = offY;

	}
}
