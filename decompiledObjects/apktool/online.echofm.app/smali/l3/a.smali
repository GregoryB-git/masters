.class public final Ll3/a;
.super Ll3/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll3/a$b;
    }
.end annotation


# instance fields
.field public final a:Ll3/d;

.field public final b:Lr3/b;

.field public final c:Lr3/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ll3/d;Lr3/b;Lr3/a;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ll3/p;-><init>()V

    iput-object p1, p0, Ll3/a;->a:Ll3/d;

    iput-object p2, p0, Ll3/a;->b:Lr3/b;

    iput-object p3, p0, Ll3/a;->c:Lr3/a;

    iput-object p4, p0, Ll3/a;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ll3/d;Lr3/b;Lr3/a;Ljava/lang/Integer;Ll3/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Ll3/a;-><init>(Ll3/d;Lr3/b;Lr3/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Ll3/a$b;
    .locals 2

    .line 1
    new-instance v0, Ll3/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll3/a$b;-><init>(Ll3/a$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public a()Lr3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/a;->c:Lr3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b()Ll3/q;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll3/a;->d()Ll3/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Ll3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/a;->a:Ll3/d;

    .line 2
    .line 3
    return-object v0
.end method
