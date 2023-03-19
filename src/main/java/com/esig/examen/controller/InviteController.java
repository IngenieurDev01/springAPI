package com.esig.examen.controller;

import com.esig.examen.modele.Invite;
import com.esig.examen.service.invite.InviteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invites")
public class InviteController {
    private final InviteService inviteService;

    public InviteController(InviteService inviteService) {
        this.inviteService = inviteService;
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Invite create(@RequestBody Invite invite){
        return inviteService.CreateInvite(invite);
    }
    @GetMapping("/read")
    public List<Invite> read(){
        return inviteService.ReadInvite();
    }
    @PutMapping("/update/{id}")
    public Invite update(@PathVariable Long id, @RequestBody Invite invite){
        return inviteService.UpdateInvite(id, invite);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return inviteService.DeleteInvite(id);
    }
}
