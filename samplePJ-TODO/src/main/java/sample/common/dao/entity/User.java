package sample.common.dao.entity;

import java.time.LocalDateTime;

public class User {

    private Long id;                 // ユーザーID
    private String email_address;    // メールアドレス
    private byte[] password;         // ハッシュ化パスワード
    private String name;             // ユーザー名
    private LocalDateTime created_at; // 登録日時
    private LocalDateTime updated_at; // 更新日時

    // --- getter / setter ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
