package repository;

public interface Repository<E, I> {
    E save(E entiry);

    E findById(I id);
}
