package za.ac.cput.pentech.paysys.repository;

public interface IRepository<T,ID> {
    T create(T t);
    T read(ID id);
    T update(ID id);
    void delete(ID id);
}
