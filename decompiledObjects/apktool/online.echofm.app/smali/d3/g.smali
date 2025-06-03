.class public final Ld3/g;
.super Ld3/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/g$b;
    }
.end annotation


# instance fields
.field public final a:Ld3/i;

.field public final b:Lr3/b;

.field public final c:Lr3/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ld3/i;Lr3/b;Lr3/a;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld3/b;-><init>()V

    iput-object p1, p0, Ld3/g;->a:Ld3/i;

    iput-object p2, p0, Ld3/g;->b:Lr3/b;

    iput-object p3, p0, Ld3/g;->c:Lr3/a;

    iput-object p4, p0, Ld3/g;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ld3/i;Lr3/b;Lr3/a;Ljava/lang/Integer;Ld3/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Ld3/g;-><init>(Ld3/i;Lr3/b;Lr3/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Ld3/g$b;
    .locals 2

    .line 1
    new-instance v0, Ld3/g$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ld3/g$b;-><init>(Ld3/g$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
