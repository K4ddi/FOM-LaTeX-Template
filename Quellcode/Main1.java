        } catch (DuplicateUserException due) {
            System.out.println("Ein Benutzer mit dieser E-Mail existiert bereits.");
            logger.logEvent(email, "Register", "DuplicateUser");
        } catch (IOException ioe) {
            System.out.println("Fehler beim Speichern des Benutzers. Details wurden protokolliert.");
            logger.logError(email, "Register IOException", ioe);
        }