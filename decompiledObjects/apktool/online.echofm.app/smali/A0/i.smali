.class public final synthetic LA0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA0/n$i$a;


# instance fields
.field public final synthetic a:LA0/n$e;

.field public final synthetic b:[I


# direct methods
.method public synthetic constructor <init>(LA0/n$e;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA0/i;->a:LA0/n$e;

    .line 5
    .line 6
    iput-object p2, p0, LA0/i;->b:[I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILd0/J;[I)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LA0/i;->a:LA0/n$e;

    .line 2
    .line 3
    iget-object v1, p0, LA0/i;->b:[I

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2, p3}, LA0/n;->u(LA0/n$e;[IILd0/J;[I)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
