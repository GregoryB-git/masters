.class public final Le7/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le7/j2;


# direct methods
.method public constructor <init>(Le7/i6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Le7/i6;->t:Le7/j2;

    .line 5
    .line 6
    iput-object p1, p0, Le7/t1;->a:Le7/j2;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Le7/t1;->a:Le7/j2;

    .line 3
    .line 4
    iget-object v1, v1, Le7/j2;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {v1}, Lx6/d;->a(Landroid/content/Context;)Lx6/c;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Le7/t1;->a:Le7/j2;

    .line 13
    .line 14
    invoke-virtual {v1}, Le7/j2;->zzj()Le7/a1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v1, v1, Le7/a1;->w:Le7/b1;

    .line 19
    .line 20
    const-string v2, "Failed to get PackageManager for Install Referrer Play Store compatibility check"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    const-string v2, "com.android.vending"

    .line 27
    .line 28
    const/16 v3, 0x80

    .line 29
    .line 30
    invoke-virtual {v1, v3, v2}, Lx6/c;->b(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    const v2, 0x4d17ab4

    .line 37
    .line 38
    .line 39
    if-lt v1, v2, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    :cond_1
    return v0

    .line 43
    :catch_0
    move-exception v1

    .line 44
    iget-object v2, p0, Le7/t1;->a:Le7/j2;

    .line 45
    .line 46
    invoke-virtual {v2}, Le7/j2;->zzj()Le7/a1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 51
    .line 52
    const-string v3, "Failed to retrieve Play Store version for Install Referrer"

    .line 53
    .line 54
    invoke-virtual {v2, v3, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return v0
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
