.class public final Lcom/google/firebase/auth/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/auth/FirebaseAuth$a;

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lio/flutter/plugins/firebase/auth/a;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/f;->a:Lcom/google/firebase/auth/FirebaseAuth$a;

    iput-object p1, p0, Lcom/google/firebase/auth/f;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/f;->a:Lcom/google/firebase/auth/FirebaseAuth$a;

    iget-object v1, p0, Lcom/google/firebase/auth/f;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-interface {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth$a;->a(Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method
