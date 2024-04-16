elim(X,[X|L1],L1).
elim(X,[_|L1],[_|L2]):- elim(X,L1,L2).