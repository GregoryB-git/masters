.class public final Li5/c$b;
.super Lh5/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public e:Lz3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz3/h$a<",
            "Li5/c$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/auth/g;)V
    .locals 0

    invoke-direct {p0}, Lh5/l;-><init>()V

    iput-object p1, p0, Li5/c$b;->e:Lz3/h$a;

    return-void
.end method


# virtual methods
.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Li5/c$b;->e:Lz3/h$a;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugins/firebase/auth/g;

    .line 4
    .line 5
    iget-object v0, v0, Lio/flutter/plugins/firebase/auth/g;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Li5/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput v1, p0, Lz3/a;->a:I

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lh5/l;->c:Lh5/g;

    .line 17
    .line 18
    iget-object v0, v0, Li5/c;->b:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
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
