public class Pair<T1, T2> {
		T1 x;
		T2 y;
		public Pair(T1 x, T2 y){
		this.x = x;
		this.y = y;
		}
		
		public Object getKey() {
			return x;
		}

		public Object getValue() {
			return y;
		}
}
