package dev.mrkevr.errand_service.exception;

public class ImageFileNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8006474173866792320L;

	public ImageFileNotFoundException() {
		super("Could not find file");
	}

	public ImageFileNotFoundException(String message) {
		super(message);
	}
}