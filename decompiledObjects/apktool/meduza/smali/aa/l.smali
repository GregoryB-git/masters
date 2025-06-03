.class public final synthetic Laa/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls9/a$a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/FirebaseMessaging;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/l;->a:Lcom/google/firebase/messaging/FirebaseMessaging;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Laa/l;->a:Lcom/google/firebase/messaging/FirebaseMessaging;

    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->i(Ljava/lang/String;)V

    return-void
.end method
