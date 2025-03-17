import 'package:dbapp/Pages/database_helper.dart';

class ContactManager {
  static final ContactManager _instance = ContactManager._internal();
  factory ContactManager() => _instance;
  ContactManager._internal();

  List<Map<String, dynamic>> contacts = [];

  Future<void> loadContacts() async {
    contacts = await DatabaseHelper().getContacts();
  }
}