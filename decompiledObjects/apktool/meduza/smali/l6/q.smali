.class public abstract Ll6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll6/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lk6/a$b;",
        "ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:[Lj6/d;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>([Lj6/d;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/q;->a:[Lj6/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Ll6/q;->b:Z

    iput p3, p0, Ll6/q;->c:I

    return-void
.end method


# virtual methods
.method public abstract a(Lk6/a$f;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
.end method
