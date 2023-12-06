package dev.mrkevr.errand_service.exception;

public class CategoryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4687314550608694453L;

	public CategoryNotFoundException() {
		super("Could not find category");
	}

	public CategoryNotFoundException(String message) {
		super(message);
	}
}
