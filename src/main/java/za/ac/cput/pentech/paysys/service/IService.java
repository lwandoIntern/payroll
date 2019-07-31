package za.ac.cput.pentech.paysys.service;

public interface IService<T,ID> {
    T create(T t);
    T read(ID id);
    T update(ID id);
    void delete(ID id);
}
