.class public final La9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz8/a<",
        "La9/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:La9/a;

.field public static final f:La9/b;

.field public static final g:La9/c;

.field public static final h:La9/e$a;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;

.field public c:La9/a;

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La9/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La9/a;-><init>(I)V

    sput-object v0, La9/e;->e:La9/a;

    new-instance v0, La9/b;

    invoke-direct {v0}, La9/b;-><init>()V

    sput-object v0, La9/e;->f:La9/b;

    new-instance v0, La9/c;

    invoke-direct {v0}, La9/c;-><init>()V

    sput-object v0, La9/e;->g:La9/c;

    new-instance v0, La9/e$a;

    invoke-direct {v0}, La9/e$a;-><init>()V

    sput-object v0, La9/e;->h:La9/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La9/e;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, La9/e;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    sget-object v2, La9/e;->e:La9/a;

    .line 19
    .line 20
    iput-object v2, p0, La9/e;->c:La9/a;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iput-boolean v2, p0, La9/e;->d:Z

    .line 24
    .line 25
    const-class v2, Ljava/lang/String;

    .line 26
    .line 27
    sget-object v3, La9/e;->f:La9/b;

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-class v2, Ljava/lang/Boolean;

    .line 36
    .line 37
    sget-object v3, La9/e;->g:La9/c;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-class v2, Ljava/util/Date;

    .line 46
    .line 47
    sget-object v3, La9/e;->h:La9/e$a;

    .line 48
    .line 49
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ly8/d;)Lz8/a;
    .locals 1

    iget-object v0, p0, La9/e;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, La9/e;->b:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
