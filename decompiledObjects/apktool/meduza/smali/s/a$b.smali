.class public final Ls/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Ls/a$b;

.field public static final d:Ls/a$b;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Ls/a;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Ls/a$b;->d:Ls/a$b;

    sput-object v1, Ls/a$b;->c:Ls/a$b;

    goto :goto_0

    :cond_0
    new-instance v0, Ls/a$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls/a$b;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Ls/a$b;->d:Ls/a$b;

    new-instance v0, Ls/a$b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls/a$b;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Ls/a$b;->c:Ls/a$b;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Ls/a$b;->a:Z

    iput-object p1, p0, Ls/a$b;->b:Ljava/lang/Throwable;

    return-void
.end method
