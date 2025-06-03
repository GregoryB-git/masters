.class public Lcom/google/android/gms/auth/UserRecoverableAuthException;
.super Lz3/f;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Intent;I)V
    .locals 0

    invoke-direct {p0, p1}, Lz3/f;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;->a:Landroid/content/Intent;

    invoke-static {p3}, Lg;->j(I)V

    iput p3, p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;->b:I

    return-void
.end method
