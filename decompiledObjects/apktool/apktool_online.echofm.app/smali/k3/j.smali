.class public abstract Lk3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/j$b;
    }
.end annotation


# instance fields
.field public final a:Lr3/a;

.field public final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lr3/a;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/j;->a:Lr3/a;

    iput-object p2, p0, Lk3/j;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Lr3/a;Ljava/lang/Class;Lk3/j$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lk3/j;-><init>(Lr3/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lk3/j$b;Lr3/a;Ljava/lang/Class;)Lk3/j;
    .locals 1

    .line 1
    new-instance v0, Lk3/j$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p0}, Lk3/j$a;-><init>(Lr3/a;Ljava/lang/Class;Lk3/j$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final b()Lr3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/j;->a:Lr3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/j;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method
