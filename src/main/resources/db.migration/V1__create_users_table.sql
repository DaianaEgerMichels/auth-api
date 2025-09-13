CREATE TABLE users {
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    login TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    role TEXT NOT NULL,
    isEnabled BOOLEAN NOT NULL,
    createdAt DATE NOT NULL,
    lastLogin DATE,
    lastUpdated DATE
}