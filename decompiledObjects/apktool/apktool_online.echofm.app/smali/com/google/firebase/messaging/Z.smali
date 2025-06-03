.class public final synthetic Lcom/google/firebase/messaging/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/google/firebase/messaging/a0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/a0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/Z;->o:Lcom/google/firebase/messaging/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/Z;->o:Lcom/google/firebase/messaging/a0;

    invoke-static {v0}, Lcom/google/firebase/messaging/a0;->a(Lcom/google/firebase/messaging/a0;)V

    return-void
.end method
