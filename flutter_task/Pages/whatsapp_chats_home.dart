import 'package:dbapp/Pages/contact_manager.dart';
import 'package:flutter/material.dart';

class WhatsAppClone extends StatefulWidget {
  const WhatsAppClone({super.key});

  @override
  // ignore: library_private_types_in_public_api
  _WhatsAppCloneState createState() => _WhatsAppCloneState();
}

class _WhatsAppCloneState extends State<WhatsAppClone> {
  final ContactManager _contactManager = ContactManager();

  @override
  void initState() {
    super.initState();
    _loadContacts();
  }

  Future<void> _loadContacts() async {
    await _contactManager.loadContacts();
    setState(() {});
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('WhatsApp Clone'), backgroundColor: Colors.teal),
      body: ListView.builder(
        itemCount: _contactManager.contacts.length,
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(_contactManager.contacts[index]['name']),
            subtitle: Text(_contactManager.contacts[index]['number']),
          );
        },
      ),
    );
  }
}
