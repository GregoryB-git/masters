.class public final Ly1/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/e$b$a;
    }
.end annotation


# static fields
.field public static final s:Ly1/e$b$a;

.field private static final serialVersionUID:J = 0x4b1ad70b9L


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:Z

.field public final q:Z

.field public final r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly1/e$b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly1/e$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly1/e$b;->s:Ly1/e$b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "jsonString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ly1/e$b;->o:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p2, p0, Ly1/e$b;->p:Z

    .line 12
    .line 13
    iput-boolean p3, p0, Ly1/e$b;->q:Z

    .line 14
    .line 15
    iput-object p4, p0, Ly1/e$b;->r:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v6, Ly1/e;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/e$b;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Ly1/e$b;->p:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Ly1/e$b;->q:Z

    .line 8
    .line 9
    iget-object v4, p0, Ly1/e$b;->r:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v0, v6

    .line 13
    invoke-direct/range {v0 .. v5}, Ly1/e;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/internal/g;)V

    .line 14
    .line 15
    .line 16
    return-object v6
.end method
