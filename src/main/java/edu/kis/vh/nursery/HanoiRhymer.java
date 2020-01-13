package edu.kis.vh.nursery;

/**
 * A class for Rhyming Hanoi, extending @DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

	/**
	 * @return number of rejected
	 */
public int reportRejected() {
	return totalRejected;
}

	/**
	 * counting function, overring from superclass
	 * @param in number to add
	 */
@Override
public void countIn(int in) {
if (!callCheck() && in > peekaboo())
		totalRejected++;
		else
			super.countIn(in);
}
}
//alt oraz strzałki przełączają między otwartymi oknami w środowisku