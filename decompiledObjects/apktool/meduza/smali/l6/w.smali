.class public final Ll6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll6/a;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public constructor <init>(Ll6/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Ll6/w;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p1, p0, Ll6/w;->a:Ll6/a;

    return-void
.end method
