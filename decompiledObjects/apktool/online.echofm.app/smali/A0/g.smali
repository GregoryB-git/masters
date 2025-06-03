.class public final synthetic LA0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA0/n$i$a;


# instance fields
.field public final synthetic a:LA0/n;

.field public final synthetic b:LA0/n$e;

.field public final synthetic c:Z

.field public final synthetic d:[I


# direct methods
.method public synthetic constructor <init>(LA0/n;LA0/n$e;Z[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA0/g;->a:LA0/n;

    .line 5
    .line 6
    iput-object p2, p0, LA0/g;->b:LA0/n$e;

    .line 7
    .line 8
    iput-boolean p3, p0, LA0/g;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, LA0/g;->d:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(ILd0/J;[I)Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, LA0/g;->a:LA0/n;

    .line 2
    .line 3
    iget-object v1, p0, LA0/g;->b:LA0/n$e;

    .line 4
    .line 5
    iget-boolean v2, p0, LA0/g;->c:Z

    .line 6
    .line 7
    iget-object v3, p0, LA0/g;->d:[I

    .line 8
    .line 9
    move v4, p1

    .line 10
    move-object v5, p2

    .line 11
    move-object v6, p3

    .line 12
    invoke-static/range {v0 .. v6}, LA0/n;->t(LA0/n;LA0/n$e;Z[IILd0/J;[I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
