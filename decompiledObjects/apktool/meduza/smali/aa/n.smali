.class public final synthetic Laa/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/e;


# instance fields
.field public final synthetic a:Ld8/t;


# direct methods
.method public synthetic constructor <init>(Ld8/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/n;->a:Ld8/t;

    return-void
.end method


# virtual methods
.method public final g(Ld8/u;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Laa/n;->a:Ld8/t;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(Ld8/t;Ld8/u;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    return-object p1
.end method
