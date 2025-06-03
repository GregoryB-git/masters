.class public abstract Lz4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/b$b;
    }
.end annotation


# static fields
.field public static final a:Lz4/a;

.field public static volatile b:Lz4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz4/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz4/b$b;-><init>(Lz4/b$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz4/b;->a:Lz4/a;

    .line 8
    .line 9
    sput-object v0, Lz4/b;->b:Lz4/a;

    .line 10
    .line 11
    return-void
.end method

.method public static a()Lz4/a;
    .locals 1

    .line 1
    sget-object v0, Lz4/b;->b:Lz4/a;

    .line 2
    .line 3
    return-object v0
.end method
