package calculator;

public class word {
	private String _original;
	private String _translation;
	
	public String get_original() {
		return _original;
	}
	public void set_original(String _original) {
		this._original = _original;
	}
	public String get_translation() {
		return _translation;
	}
	public void set_translation(String _translation) {
		this._translation = _translation;
	}
	public word() {

	}
	
	@Override
	public String toString() {
		
		return String.format("(%s , %s)", _original,_translation);
	}
}
