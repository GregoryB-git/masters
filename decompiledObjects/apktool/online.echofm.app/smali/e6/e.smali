.class public final Le6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le6/e$a;,
        Le6/e$b;,
        Le6/e$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Le6/f;

.field public final c:Lg6/l;

.field public final d:Lg6/l;

.field public final e:Lg6/p;

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/io/File;Le6/f;)V
    .locals 10

    .line 1
    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Le6/e;-><init>(Ljava/io/File;Le6/f;Lg6/l;Lg6/l;Lg6/p;IILkotlin/jvm/internal/g;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Le6/f;Lg6/l;Lg6/l;Lg6/p;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/e;->a:Ljava/io/File;

    iput-object p2, p0, Le6/e;->b:Le6/f;

    iput-object p3, p0, Le6/e;->c:Lg6/l;

    iput-object p4, p0, Le6/e;->d:Lg6/l;

    iput-object p5, p0, Le6/e;->e:Lg6/p;

    iput p6, p0, Le6/e;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Le6/f;Lg6/l;Lg6/l;Lg6/p;IILkotlin/jvm/internal/g;)V
    .locals 7

    .line 3
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    sget-object p2, Le6/f;->o:Le6/f;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_1

    const p6, 0x7fffffff

    :cond_1
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Le6/e;-><init>(Ljava/io/File;Le6/f;Lg6/l;Lg6/l;Lg6/p;I)V

    return-void
.end method

.method public static final synthetic a(Le6/e;)Le6/f;
    .locals 0

    .line 1
    iget-object p0, p0, Le6/e;->b:Le6/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Le6/e;)I
    .locals 0

    .line 1
    iget p0, p0, Le6/e;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(Le6/e;)Lg6/l;
    .locals 0

    .line 1
    iget-object p0, p0, Le6/e;->c:Lg6/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Le6/e;)Lg6/p;
    .locals 0

    .line 1
    iget-object p0, p0, Le6/e;->e:Lg6/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Le6/e;)Lg6/l;
    .locals 0

    .line 1
    iget-object p0, p0, Le6/e;->d:Lg6/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Le6/e;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Le6/e;->a:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Le6/e$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le6/e$b;-><init>(Le6/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
